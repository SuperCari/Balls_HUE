package at.fh.swengb.users;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import at.fh.swengb.users.model.Ball;

public class ShowBallActivity extends AppCompatActivity {

    private Ball ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        ball = (Ball) intent.getExtras().get("ball");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        TextView viewLastName = (TextView) findViewById(R.id.textViewLastName);
        TextView viewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);

        viewFirstName.setText((int) ball.getSize());
        viewLastName.setText(ball.getProducer());
        viewAddress.setText(ball.getColor());


    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+ball.getSize());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }


}
