package cn.jonny.android.plugin.lifecycle;

import android.os.Bundle;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        UnityPlayer.UnitySendMessage("AndroidLifeCycle", "ChangeLifeCycleState", "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPause() {
        UnityPlayer.UnitySendMessage("AndroidLifeCycle", "ChangeLifeCycleState", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        UnityPlayer.UnitySendMessage("AndroidLifeCycle", "ChangeLifeCycleState", "onResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        UnityPlayer.UnitySendMessage("AndroidLifeCycle", "ChangeLifeCycleState", "onDestroy");
        super.onDestroy();
    }

}
