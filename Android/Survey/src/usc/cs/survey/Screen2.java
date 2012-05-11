package usc.cs.survey;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class Screen2 extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main2);
	        
	    // the entity of week class
	    final Week myWeek = new Week();
	    
	    // The entity of CheckBoxData Class (AvailableHrs)
		final CheckBoxData myCBData = new CheckBoxData();
	  
	    
	    //The textView that shows what day to modify
	    final TextView DayView = (TextView) findViewById(R.id.DayView);
	    DayView.setText(myWeek.getArtElt(0));
	    
	    final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1); 
	    final CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2); 
	    final CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3); 
	    CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4); 
	    CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5); 
	    CheckBox cb6 = (CheckBox) findViewById(R.id.checkBox6); 
	    CheckBox cb7 = (CheckBox) findViewById(R.id.checkBox7); 
	    CheckBox cb8 = (CheckBox) findViewById(R.id.checkBox8); 
	    CheckBox cb9 = (CheckBox) findViewById(R.id.checkBox9); 
	    CheckBox cb10 = (CheckBox) findViewById(R.id.checkBox10); 
	    CheckBox cb11 = (CheckBox) findViewById(R.id.checkBox11); 
	    CheckBox cb12 = (CheckBox) findViewById(R.id.checkBox12); 
	    CheckBox cb13 = (CheckBox) findViewById(R.id.checkBox13); 
	    CheckBox cb14 = (CheckBox) findViewById(R.id.checkBox14); 
	    CheckBox cb15 = (CheckBox) findViewById(R.id.checkBox15); 
	    CheckBox cb16 = (CheckBox) findViewById(R.id.checkBox16); 
	    CheckBox cb17 = (CheckBox) findViewById(R.id.checkBox17); 
	    CheckBox cb18 = (CheckBox) findViewById(R.id.checkBox18); 
	    CheckBox cb19 = (CheckBox) findViewById(R.id.checkBox19); 
	    CheckBox cb20 = (CheckBox) findViewById(R.id.checkBox20); 
	    CheckBox cb21 = (CheckBox) findViewById(R.id.checkBox21); 
	    CheckBox cb22 = (CheckBox) findViewById(R.id.checkBox22); 
	    CheckBox cb23 = (CheckBox) findViewById(R.id.checkBox23); 
	    CheckBox cb24 = (CheckBox) findViewById(R.id.checkBox24); 
	    

	   // SetCheckBox(0,myCBData,cb1,cb2);
	    //!
	   // System.out.println("InitialSetCheckBox: "+myCBData.GetTest());	    
	    
	    //@
	    if(LoadPreferences(0).length() > 1)
	    {
	    	SetCheckBox(0,myCBData,cb1,cb2,cb3);
	    	myCBData.ReplaceTest(LoadPreferences(0));
	    	//Toast.makeText(getBaseContext(), ("LoadMonday: "+ LoadPreferences(0)), 	Toast.LENGTH_SHORT).show(); 
	    	//Toast.makeText(getBaseContext(), ("MyTest: "+myCBData.GetTest()), 	Toast.LENGTH_SHORT).show();
	    	System.out.println("LoadMonday: "+ LoadPreferences(0));
	    	System.out.println("MyTest: "+myCBData.GetTest());
	    }
	    
	    //final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
	    
	    // If CheckBox1 is Clicked 
	    cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(0, 'T');
					myCBData.SetTest(0, 'T'); //!
					//myCBData.GetTPData(0)
					//Toast.makeText(getBaseContext(), "+++++++++++", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(0, 'F');
					myCBData.SetTest(0, 'F'); //!
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    // If CheckBox2 is Clicked 
	    cb2.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(1, 'T');
					myCBData.SetTest(1, 'T'); //!
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(1, 'F');
					myCBData.SetTest(1, 'F'); //!
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    // If CheckBox3 is Clicked 
	    cb3.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(2, 'T');
					myCBData.SetTest(2, 'T'); //!
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(2, 'F');
					myCBData.SetTest(2, 'F'); //!
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    // If CheckBox4 is Clicked 
	    cb4.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(3, 'T');
					myCBData.SetTest(3, 'T'); //!
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(3, 'F');
					myCBData.SetTest(3, 'F'); //!
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    cb5.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(4, 'T');
					myCBData.SetTest(4, 'T'); //!
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(4, 'F');
					myCBData.SetTest(4, 'F'); //!
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	     
	    cb6.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(5, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(5, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    cb7.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(6, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(6, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    cb8.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(7, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(7, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    cb9.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(8, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(8, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
			 
	    cb10.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(9, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(9, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    cb11.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(10, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(10, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });

	    cb12.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(11, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(11, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });

	    cb13.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(12,'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(12, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });

	    cb14.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(13, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(13, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });

	    cb15.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(14, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(14, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });

	    cb16.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(15, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(15, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });

	    cb17.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(16, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(16, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    

	    cb18.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(17, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(17, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    

	    cb19.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(18, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(18, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    

	    cb20.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(19, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(19, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    

	    cb21.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(20, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(20, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    

	    cb22.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(21, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(21, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
        

	    cb23.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(22, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(22, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    

	    cb24.setOnCheckedChangeListener(new OnCheckedChangeListener() 
	    {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) 
			{

				if (buttonView.isChecked()) 
				{ 
					//Set temp data to 1
					myCBData.SetTPData(23, 'T');
					//Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_SHORT).show(); 
				} 
				else 
				{ 
					//Set temp data to 0
					myCBData.SetTPData(23, 'F');
					//Toast.makeText(getBaseContext(), "UnChecked", 	Toast.LENGTH_SHORT).show(); 
				} 
			}
	    });
	    
	    // TODO Auto-generated method stub
	    
	    // Next Button
	    final Button NextBt = (Button) findViewById(R.id.Next);
	    NextBt.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
		
				// Move to next day
				myWeek.addNextCount();
				
				if( myWeek.getNextCount() == 7  )
				{
					SavePreferences(myWeek.getNextCount()-1, myCBData.GetTest().toString());					
					System.out.println("Saving Day"+(myWeek.getNextCount()-1)+": "+ LoadPreferences(myWeek.getNextCount()-1));					
				
					//Back to Main Menu
			        Intent intent = new Intent();
			        setResult(RESULT_OK, intent);
			        finish();
			        
				}
				else
				{
					SavePreferences(myWeek.getNextCount()-1, myCBData.GetTest().toString());					
					System.out.println("Saving Day"+(myWeek.getNextCount()-1)+": "+ LoadPreferences(myWeek.getNextCount()-1));
					
					SetCheckBox(myWeek.getNextCount(), myCBData, cb1, cb2,cb3 ); //!
					myCBData.ReplaceTest(LoadPreferences(myWeek.getNextCount()));
			    	//Toast.makeText(getBaseContext(), ("LoadDay: "+myWeek.getNextCount()+"-> "+ LoadPreferences(myWeek.getNextCount())), 	Toast.LENGTH_SHORT).show(); 
			    	//Toast.makeText(getBaseContext(), ("MyTest: "+myWeek.getNextCount()+"-> "+myCBData.GetTest()), 	Toast.LENGTH_SHORT).show();
			    	System.out.println("Load: "+myWeek.getNextCount()+"-> "+ LoadPreferences(myWeek.getNextCount()));
			    	System.out.println("MyTest: "+myWeek.getNextCount()+"-> "+myCBData.GetTest());
				}
				
					// Change the Date in ViewYext
					DayView.setText(myWeek.getArtElt(myWeek.getNextCount()));	
				
				/*
				//Show the result of the 24 Checkboxes, concat into a string
				for(int i = 0 ; i < 24 ; i++)
				{
					if(myCBData.GetTPData(i) == 'T')
						myCBData.AppendAvailableHrs(myWeek.getNextCount()-1 ,'T');	//Save Previous Data
					else
						myCBData.AppendAvailableHrs(myWeek.getNextCount()-1 ,'F');
				}
					
				System.out.println("Saving Day"+(myWeek.getNextCount()-1)+": "+ myCBData.GetAvailableHrs( myWeek.getNextCount()-1 ).toString());
				SavePreferences(myWeek.getNextCount()-1, myCBData.GetAvailableHrs( myWeek.getNextCount()-1 ).toString());
				//LoadPreferences();
				//System.out.println("Day"+myWeek.getNextCount()+": "+myCBData.GetAvailableHrs( myWeek.getNextCount() ) );
				System.out.println("Day"+(myWeek.getNextCount()-1)+": "+ LoadPreferences(myWeek.getNextCount()-1));
				*/
				//cb1.setChecked(true);

				//myCBData.ReplaceTest( LoadPreferences( (myWeek.getNextCount() ) ));

				//System.out.println("Day"+(myWeek.getNextCount()-1)+": "+ myCBData.GetTest().toString());
				
				//Toast.makeText(getBaseContext(), myCBData.GetAvailableHrs(), 	Toast.LENGTH_SHORT).show(); 

				


				
			}
		});
	    
	}
	
	
	
	
	

	
	public void NextOnClick(View NextView)
    {


    }
	
    public void BackToMain1OnClick(View BackToMain1View)
    {
    	 Toast.makeText(getBaseContext(), ("Monday: "+ LoadPreferences(0)), 	Toast.LENGTH_SHORT).show(); 
        //Intent intent = new Intent();
       // setResult(RESULT_OK, intent);
        //finish();
    }
	
    private void SavePreferences(int index, String stringBuffer)
    {
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        
		switch(index)
		{
			case 0:
				editor.putString("Mon", stringBuffer); break;
			case 1:
				editor.putString("Tue", stringBuffer); break;
			case 2:
				editor.putString("Wed", stringBuffer); break;
			case 3:
				editor.putString("Thu", stringBuffer); break;
			case 4:
				editor.putString("Fri", stringBuffer); break;
			case 5:
				editor.putString("Sat", stringBuffer); break;
			case 6:
				editor.putString("Sun", stringBuffer); break;
		}
   
        editor.commit();
     }
    
    private String LoadPreferences(int index)
    {
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);     
		switch(index)
		{
			case 0:
				return sharedPreferences.getString("Mon", ""); 
			case 1:
				return sharedPreferences.getString("Tue", ""); 
			case 2:
				return sharedPreferences.getString("Wed", ""); 
			case 3:
				return sharedPreferences.getString("Thu", ""); 
			case 4:
				return sharedPreferences.getString("Fri", ""); 
			case 5:
				return sharedPreferences.getString("Sat", ""); 
			case 6:
				return sharedPreferences.getString("Sun", ""); 

		}
		return null;
    }
    
    public void SetCheckBox(int SavedIndex, CheckBoxData myCBData, CheckBox cb1, CheckBox cb2, CheckBox cb3)
    {
    	if(	LoadPreferences(SavedIndex).charAt(0) == 'T' )
    	{
				cb1.setChecked(true);
				myCBData.SetTPData(0, 'T');
    	}
    	else
    	{
    			cb1.setChecked(false);
    			myCBData.SetTPData(0, 'F');
    	}
    	if(	LoadPreferences(SavedIndex).charAt(1) == 'T' )
    	{
				cb2.setChecked(true);
				myCBData.SetTPData(1, 'T');
    	}
    	else
    	{
    			cb2.setChecked(false);
    			myCBData.SetTPData(1, 'F');
    	}
    	if(	LoadPreferences(SavedIndex).charAt(2) == 'T' )
    	{
				cb3.setChecked(true);
				myCBData.SetTPData(2, 'T');
    	}
    	else
    	{
    			cb3.setChecked(false);
    			myCBData.SetTPData(2, 'F');
    	}
    	
    	//System.out.println("Load string: "+ LoadPreferences(SavedIndex).toString());
    	//System.out.println("SetCheckBox myTest: "+ myCBData.GetTest().toString());
 
    }
    public void ChangeSavedDate(int DayIndex, int CheckPos, char val)
    {
    	
    }
    
    

}
