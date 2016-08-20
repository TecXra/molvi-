package pk.a.com.molvi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

/*

import Adapter.BloodGroupAdapter;
import Adapter.CityAdapter;
import Models.BloodCity;
import Models.BloodGroup;
import Models.Cities;
import Utils.AsyncResponse;
import Utils.RequestExecutor;

/**
 * Created by f on 5/21/2016.
 */
public class Search_Activity extends Activity {

    private Spinner BSpinner;
    private Spinner CSpinner;
    String Cid;
    String Bid;
  //  ArrayList<BloodCity> bloodcity;
   // private BloodGroupAdapter Badapter;
   // private CityAdapter Cadapter;


    private Button home, search, about, content , searchbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_first_search);


/*
        RequestExecutor re = new RequestExecutor(this);
        re.delegate = this;
        re.execute("2");







        /*

        String [] spinnerArray = {"O+ve","A+ve","B+ve","AB+ve","AB-ve","O-ve","A-ve","B-ve"};

        String [] SpinnerArea = {"Badamibag","Cooperative ","Dharampura","Darogawala","Faisal Town","Gari Shau","Ghazi Road","Ichra"};




        Spinner spinner = (Spinner) findViewById(R.id.spinnerblood);
        ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item,
                spinnerArray);
        spinner.setAdapter(spinnerArrayAdapter);



        Spinner spinner1 = (Spinner) findViewById(R.id.spinnerArea);
        ArrayAdapter spinnerAdapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_dropdown_item,
                SpinnerArea);
        spinner1.setAdapter(spinnerAdapter);





*/




        Initialize();
    }








    protected void Initialize(){
        home = (Button) findViewById(R.id.home_menu);
        search = (Button) findViewById(R.id.search_menu);
        about = (Button) findViewById(R.id.about_menu);
        content = (Button) findViewById(R.id.contect_menu);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Home_Activity.class);
                startActivity(i);
            }
        });


        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), ContectUs_Activity.class);
                startActivity(i);
            }
        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), About_Activity.class);
                startActivity(i);
            }
        });




    }
/*
    @Override
    public void onProcessCompelete(Object result) {



        bloodcity = (ArrayList<BloodCity>)result;



        Badapter= new BloodGroupAdapter(Search_Activity.this, android.R.layout.simple_spinner_item,bloodcity.get(0).getBg());
        BSpinner = (Spinner) findViewById(R.id.spinnerblood);
        BSpinner.setAdapter(Badapter); // Set the custom adapter to the spinner
        // You can create an anonymous listener to handle the event when is selected an spinner item
        BSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                BloodGroup  bobj = Badapter.getItem(position);
                Bid =""+ bobj.getId();

                Toast.makeText(Search_Activity.this, "ID: " + bobj.getId(),
                        Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapter) {  }
        });



        Cadapter= new CityAdapter (Search_Activity.this, android.R.layout.simple_spinner_item,bloodcity.get(0).getCity());
        CSpinner = (Spinner) findViewById(R.id.spinnerArea);
        CSpinner.setAdapter(Cadapter); // Set the custom adapter to the spinner
        // You can create an anonymous listener to handle the event when is selected an spinner item
        CSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                Cities cobj = Cadapter.getItem(position);
                Cid = "" + cobj.getId();
                Toast.makeText(Search_Activity.this, "ID: " + cobj.getId(),
                        Toast.LENGTH_SHORT).show();

                BloodGroup Bid;



            }
            @Override
            public void onNothingSelected(AdapterView<?> adapter) {  }
        });





        searchbtn = (Button) findViewById(R.id.searchbtn);


        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Users.class);
                i.putExtra("Bid",Bid);
                i.putExtra("Cid",Cid);
                startActivity(i);
            }
        });










    }

*/





}
