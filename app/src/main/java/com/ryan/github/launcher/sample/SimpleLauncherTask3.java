package com.ryan.github.launcher.sample;

import android.util.Log;

import com.ryan.github.launcher.task.LaunchTask;

import static com.ryan.github.launcher.sample.Constants.TAG;

/**
 * Created by Ryan
 * at 2019/7/1
 */
public class SimpleLauncherTask3 extends LaunchTask {

    @Override
    protected void call() {
        randomSleepTest();
        Log.v(TAG, "SimpleLauncherTask3 run on " + getThreadName());
    }

}
