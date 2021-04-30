package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.nameTxt);
        TextView desc = findViewById(R.id.descriptionTxt);
        Button follow = findViewById(R.id.followBtn);
        Button message = findViewById(R.id.messageBtn);

        user newUser = new user("Dave", "Description about Dave", 1, false);


        message.setText("MESSAGE");
        name.setText(newUser.name);
        desc.setText(newUser.desc);
        if (newUser.followed == false)
        {
            follow.setText("FOLLOW");
        }
        else
        {
            follow.setText("UNFOLLOW");
        }




        follow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(newUser.followed == true)
                {
                    follow.setText("FOLLOW");
                    newUser.followed = false;
                }
                else
                {
                    follow.setText("UNFOLLOW");
                    newUser.followed = true;
                }
            }
        });
    }



}