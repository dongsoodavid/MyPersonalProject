package com.ds.example.mypersonalproject;

import android.os.AsyncTask;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

    public class ConnectionPHP extends AppCompatActivity {

        // 데이터를 받아올 PHP 주소
        String url = "http://192.168.56.103/login.php";
        // 데이터를 보기위한 TextView
        TextView textViewJudge;
        // PHP를 읽어올때 사용할 변수
        public GettingPHP gPHP;
        boolean idCheck = false;
        List<DBList> userList = new ArrayList<DBList>();

//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.about_project2);
//
//            Button loginProcess = (Button) findViewById(R.id.login);
//            loginProcess.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    textViewJudge = (TextView)findViewById(R.id.judgeTextView);
//                    gPHP = new GettingPHP();
//                    gPHP.execute(url);
//
//                }
//            });
//        }

        class GettingPHP extends AsyncTask<String, Integer, String> {

            @Override
            protected String doInBackground(String... url) {
                StringBuilder jsonHtml = new StringBuilder();
                try {
                    URL phpUrl = new URL(url[0]);
                    HttpURLConnection conn = (HttpURLConnection) phpUrl.openConnection();

                    if (conn != null) {
                        conn.setConnectTimeout(20000);
                        conn.setUseCaches(false);

                        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                            while (true) {
                                String line = br.readLine();
                                if (line == null)
                                    break;
                                jsonHtml.append(line + "\n");
                            }
                            br.close();
                        }
                        conn.disconnect();

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return jsonHtml.toString();
            }

//            protected void onPostExecute(String str) {
//                try {
//                    // PHP에서 받아온 JSON 데이터를 JSON오브젝트로 변환
//                    JSONObject jObject = new JSONObject(str);
//                    // results라는 key는 JSON배열로 되어있다.
//                    JSONArray results = jObject.getJSONArray("results");
//
//                    for (int i = 0; i < results.length(); ++i) {
//                        JSONObject temp = results.getJSONObject(i);
//                        userList.add(new DBList(temp.get("ID").toString(), temp.get("Password").toString()));
//                    }
//                    EditText idEdit, passEdit;
//                    String idStr, passStr;
//                    idEdit = (EditText)findViewById(R.id.username);
//                    passEdit = (EditText)findViewById(R.id.password);
//
//                    idStr = idEdit.getText().toString();
//                    passStr = passEdit.getText().toString();
//                    for(DBList user : userList) {
//                        if(idStr.equals(user.getAccountId()) && passStr.equals(user.getAccountPw())) idCheck = true;
//                    }
//                    if(idCheck == true){
//                        Intent intent = new Intent(getApplicationContext(), page3.class);
//                        intent.putExtra("inputId", idStr);
//                        intent.putExtra("inputPassword", passStr);
//                        idCheck = false;
//                        Toast.makeText(getApplicationContext(), "로그인 성공",
//                                Toast.LENGTH_SHORT).show();
//                        startActivity(intent);
//                    } else {
//                        Toast.makeText(getApplicationContext(), "ID 또는 비밀번호를 확인하세요.",
//                                Toast.LENGTH_SHORT).show();
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                    Log.d("AAAAAAAAAAAAAAAAAAA", e.toString());
//                    textViewJudge.setText("Error 발생 - 관리자에게 문의하세요.");
//                }
            }
        }

