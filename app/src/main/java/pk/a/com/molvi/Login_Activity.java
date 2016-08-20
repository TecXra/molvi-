package pk.a.com.molvi;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/*
import Utils.AsyncResponse;
import Utils.RequestExecutor;
import Utils.RgPreference;
*/

/**
 * Created by f on 5/21/2016.
 */
public class Login_Activity extends Activity {

    SharedPreferences sharedPref;


    private EditText user, pass;
    private Button login;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);

        Initialize();
    }

    protected void Initialize() {
        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

boolean flag = getValues();

               if(flag){
          /*      RequestExecutor re = new RequestExecutor(Login_Activity.this);
                re.delegate = Login_Activity.this;
                re.execute("4", username, password);
            */   }
            }
        });
    }

    protected Boolean getValues() {
        username = user.getText().toString();
        password = pass.getText().toString();
        if (username.equals("") || password.equals(""))
        {
            Toast.makeText(Login_Activity.this, "Enter Fields",
                    Toast.LENGTH_SHORT).show();
            return false;
    }

        return true;
            }


    @Override
    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
        return;
    }
    }
/*
    @Override
    public void onProcessCompelete(Object result) {

        String User_Id = (String)result;

//        sharedPref = getPreferences(Context.MODE_PRIVATE);
  //      sharedPref.edit().putString(RgPreference.UserId, User_Id).apply();

        if(User_Id.equals("404"))
        {

            Toast.makeText(Login_Activity.this, "Invalid Username Or Password ... Tyr Again.. ",
                    Toast.LENGTH_SHORT).show();
            Intent ourIntent = new Intent(getBaseContext(), Login_Activity.class);
            startActivity(ourIntent);
            finish();

        }
        else
        {
            Intent ourIntent = new Intent(getBaseContext(), Home_Activity.class);
            startActivity(ourIntent);
            finish();

        }





    }
*/
