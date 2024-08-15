package com.example.mobileapp.data

import android.content.Context
import android.widget.Toast
import androidx.core.content.ContextCompat.RegisterReceiverFlags
import androidx.navigation.NavController
import com.example.mobileapp.models.user
import com.example.mobileapp.navigation.ROUTE_HOME
import com.example.mobileapp.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(var navController: NavController,
                    var context: Context) {
    var mAuth: FirebaseAuth
    init{
        mAuth=FirebaseAuth.getInstance()
    }
    fun signup(firstName:String,secondName:String,email:String,password:String){
        if (firstName.isBlank() || secondName.isBlank() || email.isBlank() || password.isBlank()){
            Toast.makeText(context,"Please fill in all the fields",
                Toast.LENGTH_LONG).show()
            return
        }else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(){
                if(it.isSuccessful){
                    val userdata=user(firstName,secondName,email,password,mAuth.currentUser!!.uid)
                    val regRef = FirebaseDatabase.getInstance().getReference()
                        .child("users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener{
                        if (it.isSuccessful){
                            Toast.makeText(context,"Please fill in all the fields",
                                Toast.LENGTH_LONG).show()
                        }else{
                            Toast.makeText(context,"${it.exception!!.message}",
                                Toast.LENGTH_LONG).show()
                        }
                    }
                }else{
                    navController.navigate(ROUTE_REGISTER)
                }



            }
        }
    }
    fun login(email: String,password: String){
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener{
            if (it.isSuccessful){
                Toast.makeText(context,"Successfully logged in",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"${it.exception!!.message}",
                    Toast.LENGTH_LONG).show()
            }
        }

    }
    fun isloggedin():Boolean{
        return mAuth.currentUser !=null
    }
}