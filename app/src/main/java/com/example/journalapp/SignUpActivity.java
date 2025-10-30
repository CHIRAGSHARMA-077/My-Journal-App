package com.example.journalapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Collection;

public class SignUpActivity extends AppCompatActivity {
    //Widgets
    EditText password_create, username_create,email_create;
    Button createBTN;
    // FireBase Authentication
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;

    // firebase connection
    private FirebaseFirestore db= FirebaseFirestore.getInstance();
    private CollectionReference collectionReference=db.collection("Users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        createBTN=findViewById(R.id.acc_signUp_btn);
        password_create=findViewById(R.id.password_create);
        email_create= findViewById(R.id.email_create);
        username_create=findViewById(R.id.username_create_ET);

        firebaseAuth=FirebaseAuth.getInstance();
        authStateListener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                currentUser=firebaseAuth.getCurrentUser();
                //check if user logged in or not
                if(currentUser!=null){
                    // user already logged in

                }else {
                    // the user signed out

                }

            }
        };

        createBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(username_create.getText().toString())
                        &&(!TextUtils.isEmpty(email_create.getText().toString()))
                        &&(!TextUtils.isEmpty(password_create.getText().toString()))){
                    String email=email_create.getText().toString().trim();
                    String pass=password_create.getText().toString().trim();
                    String username =username_create.getText().toString().trim();
                    CreateUserEmailAccount(email,pass,email);
                }else{
                    Toast.makeText(SignUpActivity.this, "No empty fileds are allowed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void CreateUserEmailAccount(
            String username,
            String pass,
            String email

    ){
        if(!TextUtils.isEmpty(username)
        &&!TextUtils.isEmpty(pass)
        &&!TextUtils.isEmpty(email)
        ){
            // built-in method attempts to create a new user account with a provided email and password
            firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        // here we will move to next activity but now we are just printing a toast message
                        Toast.makeText(SignUpActivity.this, "Account is created successfully", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

    }
}