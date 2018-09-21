package cnddk16.com.problem6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cach2Activity extends AppCompatActivity {
    public EditText  edtSoA, edtSoB;
    private Button btnTinhtong, btnClean;
    private TextView tvKetqua;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cach2);

        btnTinhtong = findViewById(R.id.btn_Tinhtong);
        btnClean = findViewById(R.id.btn_Clean);
        edtSoA = findViewById(R.id.edt_soA);
        edtSoB = findViewById(R.id.edt_soB);
        edtSoA.getText().toString();
        edtSoB.getText().toString();

        btnTinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtSoA.getText().toString().equals("")==false && edtSoB.getText().toString().equals("")==false){
                    int a = Integer.parseInt(edtSoA.getText().toString());
                    int b = Integer.parseInt(edtSoB.getText().toString());
                    tvKetqua = findViewById(R.id.tv_ketqua);
                    tvKetqua.setText((a+b)+"");
                }
                else Toast.makeText(Cach2Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();
            }
        });
        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtSoA.getText().toString().equals("")==false && edtSoB.getText().toString().equals("")==false){
                edtSoA.setText("");
                edtSoB.setText("");
                }
                else Toast.makeText(Cach2Activity.this, "Dữ liệu trống!!!", Toast.LENGTH_LONG).show();

            }
        });
    }
}
