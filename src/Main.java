import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания [1, 4] : ");
        int task = scanner.nextInt();
        switch (task)
        {
            case 1 :
                FirstTask.firstTask();
                break;
            case 2 :
                SecondTask.secondTask();
                break;
            case 3 :
                System.out.println("Введите размер массива:");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = (int) (Math.random() * 100);
                System.out.print("Изначальный массив : ");
                ThirdTask.printArr(arr);
                ThirdTask.thirdTask(arr);
                System.out.print("Отсортированный массив : ");
                ThirdTask.printArr(arr);
                break;
            case 4 :
                FourthTask.fourthTask();
                break;
            default :
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }
}