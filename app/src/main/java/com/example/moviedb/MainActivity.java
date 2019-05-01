package com.example.moviedb;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    String movie_name, synopsis,yor,other,rating;
    ArrayList<String> arrmovie_name = new ArrayList<>();
    ArrayList<String> arrsynopsis = new ArrayList<>();
    ArrayList<String> arryor = new ArrayList<>();
    ArrayList<String> arrother = new ArrayList<>();
    ArrayList<String> arrrating = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrmovie_name.add("xmen");
        arrsynopsis.add("good movie");
        arryor.add("2015");
        arrother.add("none");
        arrrating.add("4.4");

        arrmovie_name.add("xmen");
        arrsynopsis.add("good movie");
        arryor.add("2015");
        arrother.add("none");
        arrrating.add("4.4");

        arrmovie_name.add("avengers");
        arrsynopsis.add("good movie");
        arryor.add("2015");
        arrother.add("none");
        arrrating.add("4.4");

        arrmovie_name.add("Godfather");
        arrsynopsis.add("good movie");
        arryor.add("2015");
        arrother.add("none");
        arrrating.add("4.4");

        arrmovie_name.add("Spiderman");
        arrsynopsis.add("good movie");
        arryor.add("2015");
        arrother.add("none");
        arrrating.add("4.4");





                    listView = (ListView) findViewById(R.id.listview);

                    DetailsAdapter detailsAdapter = new DetailsAdapter(arrmovie_name,arrsynopsis,arryor,arrother,arrrating);
                    listView.setAdapter(detailsAdapter);




        }

        class DetailsAdapter extends BaseAdapter {
            ArrayList<String> arrmovie_name = new ArrayList<>();
            ArrayList<String> arrsynopsis = new ArrayList<>();
            ArrayList<String> arryor = new ArrayList<>();
            ArrayList<String> arrother = new ArrayList<>();
            ArrayList<String> arrrating = new ArrayList<>();


            public DetailsAdapter(ArrayList<String> arrmovie_name ,ArrayList<String> arrsynopsis, ArrayList<String> arryor , ArrayList<String> arrother ,ArrayList<String> arrrating) {

                this.arrmovie_name = arrmovie_name;
                this.arrsynopsis = arrsynopsis;
                this.arryor = arryor;
                this.arrother = arrother;
                this.arrrating = arrrating;
            }


            @Override
            public int getCount() {
                return arrmovie_name.size();
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View view, ViewGroup viewGroup) {
                LayoutInflater inflater = getLayoutInflater();
                View row = inflater.inflate(R.layout.list_details, viewGroup, false);

                TextView movie_name,synopsis,yor,other,rating;


                movie_name = (TextView) row.findViewById(R.id.movie_name);
                synopsis = (TextView) row.findViewById(R.id.synopsis);
                yor = (TextView) row.findViewById(R.id.yor);
                other = (TextView) row.findViewById(R.id.other);
                rating = (TextView) row.findViewById(R.id.rating);

                movie_name.setText(arrmovie_name.get(position));

                synopsis.setText(arrsynopsis.get(position));

                yor.setText(arryor.get(position));

                other.setText(arrother.get(position));

                rating.setText(arrrating.get(position));






                return row;


            }
        }


    }



