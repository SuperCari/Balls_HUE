package at.fh.swengb.users;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.users.model.Ball;

public class MainActivities extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Ball> listBall;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_activities);
        myListView = (ListView) findViewById(R.id.myUserList);

        listBall = new ArrayList<>();
        listBall.add(new Ball("Tennisball-Premium","yellow",7.00, true));
        listBall.add(new Ball("Basketball-Wilson","blue",32.00,false));
        listBall.add(new Ball("Golfball-Precept","white",5.00,true));
        listBall.add(new Ball("Tennisball-Wilson","red",5.00,true));
        listBall.add(new Ball("Golfball-Bridgestone","white",5.00,true));


        myAdapter = new CustomAdapter (this, listBall);
        myListView.setAdapter(myAdapter);
        myListView.setOnItemClickListener(this);
    }
    @Override
     public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Ball selectedBall = listBall.get(i);
        Intent intent = new Intent(view.getContext(),ShowBallActivity.class);
        intent.putExtra("ball",selectedBall);
        startActivity(intent);
    }
}
