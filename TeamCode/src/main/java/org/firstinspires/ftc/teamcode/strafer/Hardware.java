package org.firstinspires.ftc.teamcode.strafer;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.technototes.library.hardware.motor.Motor;
import com.technototes.library.hardware.sensor.IMU;
import com.technototes.library.logging.Loggable;
import com.technototes.library.structure.HardwareBase;

public class Hardware extends HardwareBase implements Loggable {
    //drive motors
    public Motor<DcMotor> flMotor;
    public Motor<DcMotor> frMotor;
    public Motor<DcMotor> rlMotor;
    public Motor<DcMotor> rrMotor;

    public IMU imu;

    public Hardware(HardwareMap hmap){
        flMotor = new Motor<DcMotor>("fl");
        frMotor = new Motor<DcMotor>("fr");
        rlMotor = new Motor<DcMotor>("rl");
        rrMotor = new Motor<DcMotor>("rr");

        imu = new IMU("imu1");

    }

}