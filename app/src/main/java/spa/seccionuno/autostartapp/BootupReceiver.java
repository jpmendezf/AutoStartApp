package spa.seccionuno.autostartapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by USUARIO on 29/07/2015.
 */
public class BootupReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context , Intent intent){
        Toast.makeText(context,"App iniciada",Toast.LENGTH_LONG).show();

        Intent i= new Intent(context,MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
