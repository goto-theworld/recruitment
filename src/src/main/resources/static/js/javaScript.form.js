Object.prototype.serialize = function () {
    let res = [],   //存放结果的数组
        current = null, //当前循环内的表单控件
        i,  //表单NodeList的索引
        len, //表单NodeList的长度
        k,  //select遍历索引
        optionLen,  //select遍历索引
        option, //select循环体内option
        optionValue,    //select的value
        form = this;    //用form变量拿到当前的表单，易于辨识

    for (i = 0, len = form.elements.length; i < len; i++) {
        current = form.elements[i];
        //disabled表示字段禁用，需要区分与readonly的区别
        if (current.disabled) continue;
        switch (current.type) {
            //可忽略控件处理
            case "file":    //文件输入类型
            case "submit":  //提交按钮
            case "button":  //一般按钮
            case "image":   //图像形式的提交按钮
            case "reset":   //重置按钮
            case undefined: //未定义
                break;
            //select控件
            case "select-one":
            case "select-multiple":
                if (current.name && current.name.length) {
                    // console.log(current)
                    for (k = 0, optionLen = current.options.length; k < optionLen; k++) {
                        option = current.options[k];
                        optionValue = "";
                        if (option.selected) {
                            if (option.hasAttribute) {
                                optionValue = option.hasAttribute('value') ? option.value : option.text
                            } else {
                                //低版本IE需要使用特性 的specified属性，检测是否已规定某个属性
                                optionValue = option.attributes('value').specified ? option.value : option.text;
                            }
                        }
                        if (optionValue !== "")
                            res.push(encodeURIComponent(current.name) + "=" + encodeURIComponent(optionValue));
                    }
                }
                break;
            //单选，复选框
            case "radio":
            case "checkbox":
                //这里有个取巧 的写法，这里的判断是跟下面的default相互对应。
                //如果放在其他地方，则需要额外的判断取值
                if (!current.checked)
                    break;
            default:
                //一般表单控件处理
                if (current.name && current.name.length) {
                    res.push(encodeURIComponent(current.name) + "=" + encodeURIComponent(current.value));
                }
        }
    }
    return res.join("&");
};
