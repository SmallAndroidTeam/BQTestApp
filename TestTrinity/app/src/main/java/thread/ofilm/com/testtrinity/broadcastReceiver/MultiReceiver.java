package thread.ofilm.com.testtrinity.broadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MultiReceiver extends BroadcastReceiver {
    
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
       if(intent!=null){
           intent.getStringExtra(intent.getAction());
           intent.getStringExtra("tts");
           Log.i("bq11",intent.getAction()+"//"+ intent.getStringExtra(intent.getAction())+"//"+intent.getStringExtra("tts"));
       }
    }
}
