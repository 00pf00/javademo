| 测试场景  | 测试方法 | 测试结果  |
|:----------|:----------|:----------|
|创建包含static属性的对象，使用new方法<br>给对象赋值，直接调用get(),如果返回值不为null<br>多次调用get()方法返回值是否相同||返回值不为空,多次调用的值一样|
|多次new包含static属性的对象，属性值是否相同||属性值相同|