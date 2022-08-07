package com.xyc.todolist.dto;
public class ResultCode {
    /**
     * A0000 成功
     * A0001 教师登陆
     * A0002 管理员登陆
     * R0001 用户不存在
     * R0002 密码错误
     * R0003 参数错误
     * R0004 用户已经存在
     * R0005 网络错误
     * R0006 上传图片为空
     * R0007 考试已过期
     * R0008 没有权限
     * R0009 编译出错
     * R0010 测试用例权重不是100
     * R0011 没有上一题
     * R0012 没有下一题
     * R0013 上传为空
     * R0014 模块关闭
     * R0015 所选阶段题目数不足不能生成试卷
     * R0016 按类型查题目时没有这类型的题目
     * R0017 测试用例输出不一致
     * R0018 使用的浏览器不是Chrome
     * R0019 代码填空题初始代码被修改
     */
    public static String SUCCESS = "A0000";
    public static String USER_NOT_EXIST = "R0001";
    public static String WRONG_PASSWORD = "R0002";
    public static String WRONG_PARAMS = "R0003";
    public static String USER_EXIST = "R0004";
    public static String NET_ERROR = "R0005";
    public static String FILE_UPLOAD_NULL = "R0006";
}