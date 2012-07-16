package tn.orange.secoure;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class DashBoardActivity extends Activity {
    GridView MyGrid;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);

        /*
         * Here we setContentView() to main.xml, get the GridView and then fill
         * it with the ImageAdapter class that extend from BaseAdapter
         */

        MyGrid = (GridView) findViewById(R.id.MyGrid);
        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();
		 
        HashMap<String, String> map;
        
        map = new HashMap<String, String>();
        map.put("titre", "agir");
        map.put("img", String.valueOf(R.drawable.agir));
        listItem.add(map);
 
        map = new HashMap<String, String>();
        map.put("titre", "se former");
        map.put("img", String.valueOf(R.drawable.former));
        listItem.add(map);
        
        map = new HashMap<String, String>();
        map.put("titre", "Quizz");
        map.put("img", String.valueOf(R.drawable.quizz));
        listItem.add(map);
        
        map = new HashMap<String, String>();
        map.put("titre", "dons");
        map.put("img", String.valueOf(R.drawable.donner));
        listItem.add(map);
        
        
        SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.items,
               new String[] {"img", "titre"}, new int[] {R.id.img, R.id.title});
        MyGrid.setAdapter(mSchedule);
    }
}