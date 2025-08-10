import { Link, useNavigate } from 'react-router-dom';
import img from './img/reg.jpg';
import { useState } from 'react';
import axios from "axios";
function Register(){
    const[reg,setreg]=useState("");
    const[name,setname]=useState("");
    const[password,setpassword]=useState("");
    const[year,setyear]=useState("");
    const[college,setcollege]=useState("");
    const Navigate=useNavigate();

    const registerhandling=async()=>{
        const Register={
            reg,name,password,year,college
        }
        if(!reg||!name||!password||!year||!college){
            return alert("please fill all the field")
        }
        try {
            const response=await axios.post("http://localhost:8081/Student-register",Register);
            console.log(response.data);
            if(response.data){
                alert("Registration is successfull")
                Navigate("/")
            }
        } catch (error) {
            alert("Back-end is not connected")
        }
    }
    return(
        <div className="row">
        <div className="col-6">
        <img className="
        ms-3 mt-3" src={img} alt='' width="500px"height="500px"></img>
        </div>
        <div className="col-6">
    <div className="form-group shadow border-success p-3" style={{width:"300px",marginTop:"95px"}}>
        <p className="h4 text-center">Student Register</p>
        <input value={reg}onChange={(e=>setreg(e.target.value))} className="from-control mt-2" type="number" placeholder="Enter your reg"></input>
        <input value={name}onChange={(e=>setname(e.target.value))} className="from-control mt-2" type="text" placeholder="Enter your name"></input>
        <input value={password}onChange={(e=>setpassword(e.target.value))} className="from-control mt-2" type="password" placeholder="Enter your password"></input>
        <input value={year}onChange={(e=>setyear(e.target.value))}className="from-control mt-2" type="number" placeholder="Enter your year"></input>
        <input value={college}onChange={(e=>setcollege(e.target.value))}className="from-control mt-2" type="text" placeholder="Enter your college"></input>
        <button className="btn btn-primary w-100" onClick={registerhandling}>Register</button>
        <p className="mt-3 ms-3">Do you have an account?<Link to="/" className="btn btn-outline-danger">Login</Link></p>
    </div>
        </div>
        </div>
    )
}
export default Register;
 //   private int reg;
  //  private String name;
   // private String password;
   // private String year;
  //  private String college;