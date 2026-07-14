//package org.firstinspires.ftc.FTC26_11052base.OpMode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorEx;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//
//public class blocker {
//
//    public DcMotorEx blockerMotor;
//    private OpMode opMode;
//
//    // Adjust this to match your exact motor's specifications!
//    // Example: GoBILDA 19.2:1 Yellow Jacket = 537.7 ticks per revolution
//    private static final double TICKS_PER_REV = 537.7;
//
//    public void init(HardwareMap hw, OpMode opMode) {
//        this.opMode = opMode;
//
//        // Using DcMotorEx for better PID accuracy when holding position
//        blockerMotor = hw.get(DcMotorEx.class, "blockerMotor");
//
//        // Reset encoder to establish "0" position, then configure behavior
//        blockerMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        blockerMotor.setTargetPosition(0);
//        blockerMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        blockerMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//    }
//
//    /**
//     * Controls the blocker using a target rotation.
//     * * @param targetRotations How many rotations to spin (e.g., 0.5, 1.2, -0.75)
//     * @param speed The maximum speed (0.0 to 1.0) the motor should use to get there
//     */
//    public void updateBlocker(double targetRotations, double speed) {
//        // Calculate target ticks
//        int targetTicks = (int) (targetRotations * TICKS_PER_REV);
//
//        if (opMode.gamepad1.b) {
//            // When 'B' is pressed, go to target rotation
//            blockerMotor.setTargetPosition(targetTicks);
//        } else {
//            // When 'B' is released, return to home (0) position
//            blockerMotor.setTargetPosition(0);
//        }
//
//        // Keep the motor in RUN_TO_POSITION mode
//        blockerMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//        // Set the speed limit. The motor automatically slows down and stops at the target.
//        blockerMotor.setPower(speed);
//    }
//}