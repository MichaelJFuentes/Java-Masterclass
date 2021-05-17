package Arrays;

public class TargetNumber {
    public static void main(String[] args) {
        int[] myNumbers = {1,2,4,4};
        int target = 8;
        System.out.println(containsNumbers(myNumbers, target));

        int[] setTwo = {1,2,3,9};
        System.out.println(containsNumbers(setTwo, target));
    }

    public static boolean containsNumbers(int[] numbers, int target) {
        int[] nums = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    ;
                } else {
                    if (numbers[i] + numbers[j] == target) {
                        System.out.println(numbers[i]);
                        System.out.println(numbers[j]);
                        nums[0] = numbers[i];
                        nums[1] = numbers[j];
                        for (int element :
                                nums) {
                            System.out.println(element);
                        }
                        return true;
                    }
                }
            }
        }
        System.out.println(nums[0] + " + " + nums[1] + " = " + target);
        return false;
    }



}
