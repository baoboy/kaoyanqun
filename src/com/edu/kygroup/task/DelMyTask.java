package com.edu.kygroup.task;

import com.edu.kygroup.domin.Task;

public class DelMyTask extends BaseAsyncTask<Task, Void, Integer> {
	private Task task;

	@Override
	protected Integer doInBackground(Task... params) {
		task = params[0];
		return task.delTask();
	}

}
