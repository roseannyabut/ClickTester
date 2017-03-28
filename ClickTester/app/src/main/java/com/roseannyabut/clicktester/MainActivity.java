package com.roseannyabut.clicktester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //exit button
        View button = findViewById(R.id.button);
        button.setOnClickListener(this);

        //Yellow block
        View yellow = findViewById(R.id.yellow_view);
        yellow.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                shortclickTopLeft();
            }
        });

        yellow.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                longclickTopLeft();
                return true;
            }
        });


        //Green block
        View green = findViewById(R.id.green_view);
        green.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                shortclickTopRight();
            }
        });

        green.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                longclickTopRight();
                return true;
            }
        });


        //Blue block
        View blue = findViewById(R.id.blue_view);
        blue.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                shortclickBottomLeft();
            }
        });

        blue.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                longclickBottomLeft();
                return true;
            }
        });


        //Red block
        View red = findViewById(R.id.red_view);
        red.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                shortclickBottomRight();
            }
        });

        red.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                longclickBottomRight();
                return true;
            }
        });
    }


    //click tester top part
    public void shortclickTopLeft()
    {
        Toast.makeText(this, "Short click in top left", Toast.LENGTH_SHORT).show();
    }

    public void shortclickTopRight()
    {
        Toast.makeText(this, "Short click in top right", Toast.LENGTH_SHORT).show();
    }

    public void longclickTopLeft()
    {
        Toast.makeText(this, "Long click in top left", Toast.LENGTH_SHORT).show();
    }

    public void longclickTopRight()
    {
        Toast.makeText(this, "Long click in top right", Toast.LENGTH_SHORT).show();
    }


    //click tester bottom part
    public void shortclickBottomLeft()
    {
        Toast.makeText(this, "Short click in bottom left", Toast.LENGTH_SHORT).show();
    }

    public void shortclickBottomRight()
    {
        Toast.makeText(this, "Short click in bottom right", Toast.LENGTH_SHORT).show();
    }

    public void longclickBottomLeft()
    {
        Toast.makeText(this, "Long click in bottom left", Toast.LENGTH_SHORT).show();
    }

    public void longclickBottomRight()
    {
        Toast.makeText(this, "Long click in bottom right", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.button)
        {
                Toast.makeText(this, "exit", Toast.LENGTH_SHORT).show();
                finish();
        }
    }
}

