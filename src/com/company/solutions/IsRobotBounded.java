package com.company.solutions;

public class IsRobotBounded {

    public static void main(String[] args) {
        String path = "GGLLRRRRGG";
        System.out.println(checkIsRobotBounded(path));
    }

    private static char updateFacingDirectionClockwise(char input) {
        if(input == 'N') { return 'W'; }
        else if(input == 'W') { return  'S'; }
        else if(input == 'S') { return 'E'; }
        else if(input == 'E') { return  'N'; }
        else { throw new IllegalArgumentException("Incorrect input");}
    }

    private static char updateFacingDirectionAntiClockwise(char input) {
        if(input == 'N') { return 'E'; }
        else if(input == 'W') { return  'N'; }
        else if(input == 'S') { return 'W'; }
        else if(input == 'E') { return  'S'; }
        else { throw new IllegalArgumentException("Incorrect input");}
    }

    private static boolean checkIsRobotBounded(String instruction) {
        if(instruction.length() == 0) {
            return true;
        }
        int x_axis = 0;
        int y_axis = 0;
        char facingDirection = 'N';
        char[] instructions = new char[instruction.length()];
        instruction.getChars(0, instruction.length(), instructions, 0);
        int counter = 0;
        int index = 0;
        do {
            switch (instructions[index]) {
                case 'G':
                    if(facingDirection == 'N') { y_axis +=1; }
                    else if(facingDirection == 'W') { x_axis -=1; }
                    else if(facingDirection == 'S' ) { y_axis -=1; }
                    else if(facingDirection == 'E' ) { x_axis +=1; }
                    break;

                case 'L':
                    facingDirection = updateFacingDirectionAntiClockwise(facingDirection);
                    break;

                case 'R':
                    facingDirection = updateFacingDirectionClockwise(facingDirection);
                    break;
            }
            index++;
            counter ++;
            if(index == instructions.length) { index =0; }
            if(x_axis == 0 && y_axis == 0 && counter >= instructions.length) {
                return true;
            }
        }while (counter != 100);
        return false;
    }
}
