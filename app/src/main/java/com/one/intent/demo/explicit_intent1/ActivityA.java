package com.one.intent.demo.explicit_intent1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoActivity(View v)
    {
        switch (v.getId())
        {
            case R.id.bmethod1:
                Intent i = new Intent(ActivityA.this, ActivityB.class);
                startActivity(i);
                break;

            case R.id.bmethod2:
                Intent j = new Intent("com.one.intent.demo.explicit_intent1.ActivityB");
                startActivity(j);
                break;
             /*
                Intent j = new Intent("Any name same as given above action of DEFAULT category");
                startActivity(j);
             */
            case R.id.bmethod3:
                Intent k = new Intent();
                k.setClassName("com.one.intent.demo.explicit_intent1", "com.one.intent.demo.explicit_intent1.ActivityB");
                startActivity(k);
                break;
            /*
                Intent k = new Intent(Package Name, Package Name.ActivityB);
                startActivity(k);
             */
        }
    }

}
