import { Link, useNavigate } from 'react-router-dom';
import img from './img/Login.jpg';
import { useEffect, useState } from 'react';
import axios from 'axios';
function Login(){
    const[reg,setreg]=useState("");
    const[password,setpassword]=useState("");
    useEffect(
        ()=> {
            sessionStorage.clear();
        },[]
    )
    const Navigate=useNavigate();
    const Loginhandling =async()=>{
        const Login={
            reg,password
        }
        if(!reg||!password){
            return alert("Please fill all the fields")
        }
         try {
                    const response=await axios.post("http://localhost:8081/Student-Login",Login);
                    console.log(response.data);
                    if(response.data==="Login Successfull"){
                        alert("Login is successfull")
                        Navigate("/Home");
                        sessionStorage.setItem('reg',reg);
                    }else{
                        alert("login failed");
                        Navigate("/Register")
                    }
                } catch (error) {
                    alert("backend is not connected");
                }
            }
    return(
        <div className="row">
        <div className="col-6">
        <img className="ms-5 mt-5" src={img} alt='' width="450px"height="450px "></img>
           </div>
        <div className="col-6">
    <div className="form-group shadow border-success p-3" style={{width:"400px",height:"300px",marginTop:"100px"}}>
    <p className="h4 text-center">Login</p>
    <label>Register Number</label>
    <input value={reg}onChange={(e=>setreg(e.target.value))} className="form-control mt-2" type="number" placeholder="Enter your Regno"></input>
    <label>Password</label>
    <input value={password}onChange={(e=>setpassword(e.target.value))}  className="form-control mt-2" type="password" placeholder="Enter your password"></input>
    <button className="btn btn-success w-100 mt-3" onClick={Loginhandling}>Login</button>
    <p className="mt-3 ms-3 text-center">Do you have account?<Link to="/Register" className="btn btn-outline-primary">Register</Link></p>
    </div>
        </div>
        </div>
    )
}
export default Login;