package cnddk16.com.problem6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cach3Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtA, edtB;
    private TextView tvKQ;
    private Button btnTong, btnClean;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cach3);
        TimID();
        LayDL();
        btnTong.setOnClickListener(this);
        btnClean.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_Tong:
                KiemTra();
                break;
            case R.id.btn_Clean:
                KiemTra();
                edtA.setText("");
                edtB.setText("");
                tvKQ.setText("");
                break;
        }
    }
    public void TimID() {
        edtA = findViewById(R.id.edt_soA);
        edtB = findViewById(R.id.edt_soB);
        tvKQ = findViewById(R.id.tv_ketqua);
        btnClean = findViewById(R.id.btn_Clean);
        btnTong = findViewById(R.id.btn_Tong);
    }
    public void LayDL(){
        edtA.getText().toString();
        edtB.getText().toString();
    }
    public void KiemTra(){
        if (edtA.getText().toString().equals("") == false && edtB.getText().toString().equals("") == false){
            int a = Integer.parseInt(edtA.getText().toString());
            int b = Integer.parseInt(edtB.getText().toString());
            tvKQ.setText((a+b)+"");
        }
        else Toast.makeText(Cach3Activity.this, "Dữ liệu rỗng", Toast.LENGTH_SHORT).show();
    }
}