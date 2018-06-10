package itzperkinz.gameone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    List<String> lb = new ArrayList<String>();
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        lv = (ListView) findViewById(R.id.leaderboard);
        ArrayAdapter ada = new ArrayAdapter(lv.getContext(), android.R.layout.simple_list_item_1, lb);
        lv.setAdapter(ada);
    }

    public void StartGame() {

    }
}
