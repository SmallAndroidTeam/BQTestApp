package thread.ofilm.com.testtrinity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final  static String PLAY_ACTION="music.play";//
    public final  static String PREV_ACTION="music.prev";
    public final  static String NEXT_ACTION="music.next";
    public final  static String PAUSE_ACTION="music.pause";
    public final static String STOP_ACTION="music.stop";
    public final  static String START_ACTION="music.start";
    public final static String OPENMUSIC_ACTION="music.open";
    public final static String CLOSEMUSIC_ACTION="music.close";
    public final static String CONTINUE_ACTION="music.continue";
    public final static String RANDOM_ACTION="music.random";
    public final static String LOOPALL_ACTION="music.loop.all";
    public final static String LOOPSINGLE_ACTION="music.loop.single";
    public final static String LOOPRANDOM_ACTION="music.loop.random";
    public final static String LISTOPEN_ACTION="music.list.open";
    public final static String LISTCLOSE_ACTION="music.list.close";
    public final static String FAVOUR_ACTION="music.favour";
    public final static String UNFAVOUR_ACTION="music.unfavour";
    public final static String FAVOUROPEN_ACTION="music.favour.open";
    public final static String UNFAVOURCLOSE_ACTION="music.unfavour.close";
    private Button playButton,pauseButton,prevButton,nextButton,startButton,stopButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setListener();
       
    }
    private void init() {
        playButton=this.findViewById(R.id.playbutton);
        pauseButton=this.findViewById(R.id.pausebutton);
        prevButton=this.findViewById(R.id.prevbutton);
        nextButton=this.findViewById(R.id.nextbutton);
        startButton=this.findViewById(R.id.startbutton);
        stopButton=this.findViewById(R.id.stopbutton);
    }
    private void setListener() {
        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);
        prevButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        startButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.playbutton:
                Log.i("bq11","       11");
               Intent intent=new Intent(PLAY_ACTION);
               intent.setPackage("of.media.bq");
               sendBroadcast(intent);
                Log.i("bq11","       12");
                break;
            case R.id.pausebutton:
                Log.i("bq11","       21");
                Intent intent1=new Intent(PAUSE_ACTION);
                intent1.setPackage("of.media.bq");
                sendBroadcast(intent1);
                Log.i("bq11","       22");
                break;
            case R.id.prevbutton:
                Log.i("bq11","       11");
                Intent intent2=new Intent(PREV_ACTION);
                intent2.setPackage("of.media.bq");
                sendBroadcast(intent2);
                break;
            case R.id.nextbutton:
                Intent intent3=new Intent(NEXT_ACTION);
                intent3.setPackage("of.media.bq");
                sendBroadcast(intent3);
                break;
            case R.id.startbutton:
                Intent intent4=new Intent(NEXT_ACTION);
                intent4.setPackage("of.media.bq");
                sendBroadcast(intent4);
                break;
            case R.id.stopbutton:
                Intent intent5=new Intent(STOP_ACTION);
                intent5.setPackage("of.media.bq");
                sendBroadcast(intent5);
                break;
                default:
                    break;
        }
    }
}
