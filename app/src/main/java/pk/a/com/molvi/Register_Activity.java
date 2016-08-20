package pk.a.com.molvi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by f on 5/21/2016.
 */
public class Register_Activity extends Activity {

    private EditText uemail, pass, cnfpassword;
    private Button submit;

    String Email;
    String Password;
    String ConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);
        Initialize();
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              getValues();
            }
        });
    }

    protected void Initialize(){

        uemail = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        cnfpassword = (EditText) findViewById(R.id.confpass);

        submit = (Button)findViewById(R.id.Register);

    }

    protected void getValues() {
        Email = uemail.getText().toString();
        Password = pass.getText().toString();
        ConfirmPassword = cnfpassword.getText().toString();
        if (Email.length() == 0) {
            uemail.setError("Enter Email");
        } else if (Password.length() == 0) {
            pass.setError("Enter Password");
        } else if (ConfirmPassword.length() == 0) {
            cnfpassword.setError("Enter Password");
        }

        else if (!Password.equals(ConfirmPassword)) {
            cnfpassword.setError("Password Missmatch");
        }
        else {

            Toast.makeText(this, "Screw You Aloo :)", Toast.LENGTH_SHORT).show();
        }


        Response.Listener<String> responselistener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String userKey = jsonObject.getString("id");
                    if(userKey != null)
                    {
                        Toast.makeText(Register_Activity.this,"key is "+" ",Toast.LENGTH_LONG).show();
                    }
                    else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Register_Activity.this);
                        builder.setMessage("Register Failed")
                                .setNegativeButton("Retry",null)
                                .create()
                                .show();

                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };


        
        RegisterRequest registerRequest = new RegisterRequest(Email,Password,ConfirmPassword,responselistener);
        RequestQueue queue = Volley.newRequestQueue(Register_Activity.this);
        queue.add(registerRequest);
        
        
        
        
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
        return;
    }



}
