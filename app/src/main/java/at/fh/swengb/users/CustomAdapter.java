package at.fh.swengb.users;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import at.fh.swengb.users.model.Ball;
import java.util.List;

/**
 * Created by Carina on 18.11.2016.
 */

public class CustomAdapter extends BaseAdapter {
    List<Ball> listBall;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Ball> listUsers) {
        this.context = applicationContext;
        this.listBall= listUsers;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listBall.size();
    }

    @Override
    public Object getItem(int i) {
        return listBall.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }

        //ViewHolder

        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewSize=(TextView)view.findViewById(R.id.textViewListPhone);

        Ball ball = listBall.get(i);
        viewName.setText(ball.getProducer());
        viewAddress.setText(ball.getColor());
        viewSize.setText(ball.getSize()+ " cm");

        return view;
    }
}

