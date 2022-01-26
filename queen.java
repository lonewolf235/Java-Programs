
import java.util.*;

public class queen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a > 14 || a < 11) {
            System.out.println("Invalid");
            System.out.println("Queen 1");
        
        } else {
            if (a == 11) {
                if (b == 21) {
                    if (c == 31) {
                        if (d == 41) {
                            System.out.println("Valid");
                        } else {
                            System.out.println("Invalid");
                            System.out.println("Queen 4");
                        }
                    } else {
                        System.out.println("Invalid");
                        System.out.println("Queen 3");
                    }
                } else if (b == 22) {
                    if (c == 33) {
                        if (d == 44) {
                            System.out.println("Valid");
                        } else {
                            System.out.println("Invalid");
                            System.out.println("Queen 4");
                        }
                    } else {
                        System.out.println("Invalid");
                        System.out.println("Queen 3");
                    }
                } else {
                    System.out.println("Invalid");
                    System.out.println("Queen 2");
                }
            } else if (a == 12) {
                if (b == 22) {
                    if (c == 32) {
                        if (d == 42) {
                            System.out.println("Valid");
                        } else {
                            System.out.println("Invalid");
                            System.out.println("Queen 4");
                        }
                    } else {
                        System.out.println("Invalid");
                        System.out.println("Queen 3");
                    }
                } else {
                    System.out.println("Invalid");
                    System.out.println("Queen 2");
                }
            } else if (a == 13) {
                if (b == 23) {
                    if (c == 33) {
                        if (d == 43) {
                            System.out.println("Valid");
                        } else {
                            System.out.println("Invalid");
                            System.out.println("Queen 4");
                        }
                    } else {
                        System.out.println("Invalid");
                        System.out.println("Queen 3");
                    }
                } else {
                    System.out.println("Invalid");
                    System.out.println("Queen 2");
                }
            } else if (a == 14) {
                if (b == 24) {
                    if (c == 34) {
                        if (d == 44) {
                            System.out.println("Valid");
                        } else {
                            System.out.println("Invalid");
                            System.out.println("Queen 4");
                        }
                    } else {
                        System.out.println("Invalid");
                        System.out.println("Queen 3");
                    }
                } else if (b == 23) {
                    if (c == 32) {
                        if (d == 41) {
                            System.out.println("Valid");
                        } else {
                            System.out.println("Invalid");
                            System.out.println("Queen 4");
                        }
                    } else {
                        System.out.println("Invalid");
                        System.out.println("Queen 3");
                    }
                } else {
                    System.out.println("Invalid");
                    System.out.println("Queen 2");
                }
            }

        }
        if ((d - a) == 30)
            System.out.println("0");
        else if (d > 44 || d < 41)
            System.out.println("0");
            else if (a > 14 || a < 11)
            System.out.println("0");
        else
            System.out.println("2");
    }
}