package QuesSeven.ProgramFive;

public class TaskExecutor {
    public static void executeTask(RunnableTask task) {
        task.run(); // 调用接口的 run 方法
    }

    // 测试代码
    public static void main(String[] args) {
        // 创建 PrintTask 和 SaveTask 对象
        RunnableTask printTask = new PrintTask();
        RunnableTask saveTask = new SaveTask();

        // 调用 executeTask 方法
        executeTask(printTask); // 输出: Printing a document
        executeTask(saveTask);  // 输出: Saving a file
    }
}
