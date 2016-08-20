package pk.a.com.molvi;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/*
import Adapter.UsersAdapter;
import Models.SRUser;
import Utils.AsyncResponse;
import Utils.RequestExecutor;
*/
public class Users extends AppCompatActivity {

    private ProgressDialog progress;
    ListView listView;

  //  ArrayList<SRUser> UserList ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);


        Intent intent = getIntent();
        String Bid = intent.getStringExtra("Bid");
        String Cid = intent.getStringExtra("Cid");


/*
        RequestExecutor re = new RequestExecutor(this);
        re.delegate = this;
        re.execute("1",Bid,Cid);




    }

    @Override
    public void onProcessCompelete(Object result) {

        UserList = (ArrayList<SRUser>)result;

        listView= (ListView) findViewById(R.id.UserList);
        UsersAdapter ba = new UsersAdapter(UserList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the current item from ListView
                View view = super.getView(position,convertView,parent);
                if(position %2 == 1)
                {
                    view.setBackgroundColor(Color.parseColor("#FFB6B546"));
                }
                else
                {
                    view.setBackgroundColor(Color.parseColor("#FFCCCB4C"));
                }
                return view;
            }
        };
        listView.setAdapter(ba);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                Intent I = new Intent(Users.this,ContectUs_Activity.class);
                I.putExtra("Id",UserList.get(position).getId());
                I.putExtra("Name",UserList.get(position).getName());
                I.putExtra("Contact",UserList.get(position).getContact());
                startActivity(I);
            }
        });
*/
    }
}
