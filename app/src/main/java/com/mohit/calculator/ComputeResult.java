package com.mohit.calculator;
import java.math.*;

public class ComputeResult
{
    public float compute(float f1,float f2,int opcode)
    {   float val=0.0f;
        switch (opcode)
        {
            case 1 : val=f1+f2;
                break;
            case 2 : val=f1-f2;
                break;
            case 3 : val=f1*f2;
                break;
            case 4 : val=f1/f2;
                break;
            case 5 : val=(f1*f2)/100;
                break;
            case 6 : val = f1*(float)Math.PI;
        }
        return val;
    }
}
