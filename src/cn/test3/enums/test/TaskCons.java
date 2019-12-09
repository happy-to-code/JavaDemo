package cn.test3.enums.test;

public class TaskCons {

    /**
     * 任务的状态
     */
    public enum STATUS {
        NEW, //新任务
        ASSIGNED, //坐席已分配
        NOTIFY_SA, // 已通知销售顾问
        SA_FEEDBACK, // 销售顾问已反馈
        FEEDBACK_REDO,    // 反馈重录
        SA_UPDATED,    // 更新
        UPDATE_REDO, // 更新重录
        STOP,    // 终止
        DONE    // 完成
    }
}
