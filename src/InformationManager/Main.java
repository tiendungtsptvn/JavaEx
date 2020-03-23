package InformationManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public float scoreCaculation(ArrayList<ListSubject> list , float scoreOfSub, int numPartOfSub){
        int totalNumPart=0 ;
        float sum=0 ;
        for(int i=0 ; i<list.size() ; i++){
            sum=sum+ (scoreOfSub*numPartOfSub) ;
            totalNumPart=totalNumPart+numPartOfSub ;
        }
        return (sum/totalNumPart) ;
    }

    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        ArrayList<Teacher> teachersList = new ArrayList<>() ;
        ArrayList<ListSubject> listSubjectArrayList=new ArrayList<>() ;
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        System.out.println("Lua chon chuc nang: ");
        System.out.println("1. Hien thi danh sach sinh vien kem thong tin");
        System.out.println("2. Hien thi danh sach giao vien kem thong tin");
        System.out.println("3. Hien thi danh sach lop hoc");
        System.out.println("4. Them sinh vien");
        System.out.println("5. Them giao vien");
        System.out.println("6. Sua thong tin sinh vien hoac giao vien");
        System.out.println("7. Xoa sinh vien");
        System.out.println("8. Sua diem hoc phan");
        System.out.println("0. Thoat chuong trinh");
        while (choice >= 0) {
            System.out.println("Ban chon chuc nang nao ?");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    choice = -1;
                    break;
                case 1:
                    if (studentsList.size() == 0)
                        System.out.println("Hay them sinh vien vao danh sach");
                    else {
                        for (int i = 0; i < studentsList.size(); i++) {
                            System.out.println("Ho ten: " + studentsList.get(i).getmName());
                            System.out.println("Nam sinh: " + studentsList.get(i).getmYearOfBirth());
                            System.out.println("Gioi tinh " + studentsList.get(i).getmGender());
                            System.out.println("Ma sinh vien: " + studentsList.get(i).getmPersonalCode());
                            System.out.println("Ma lop: " + studentsList.get(i).getmClassCode());
                            int totalNumPart=0 ;
                            float sum=0 ;
                            for(int j=0 ; j<listSubjectArrayList.get(i).getmNumberOfSubject() ; j++){
                                sum=sum+listSubjectArrayList.get(i).subjectArrayList.get(j).getmScores()
                                        *listSubjectArrayList.get(i).subjectArrayList.get(j).getmPartNumSubject() ;
                                totalNumPart=totalNumPart+listSubjectArrayList.get(i).subjectArrayList.
                                        get(j).getmPartNumSubject() ;
                            }
                            System.out.println("Diem trung binh tich luy: "+(sum/totalNumPart));
                            System.out.println("--------");
                        }
                    }
                    break;
                case 2:
                    if (teachersList.size() == 0)
                        System.out.println("Hay them giao vien vao danh sach");
                    else {
                        for (int i = 0; i < teachersList.size(); i++) {
                            System.out.println("Ho ten: " + teachersList.get(i).getmName());
                            System.out.println("Nam sinh: " + teachersList.get(i).getmYearOfBirth());
                            System.out.println("Gioi tinh " + teachersList.get(i).getmGender());
                            System.out.println("Ma giao vien : " + teachersList.get(i).getmPersonalCode());
                            System.out.println("Ma lop: " + teachersList.get(i).getmClassCode());
                            System.out.println("--------");
                        }
                    }
                    break;
                case 3:
                    if(teachersList.size()==0 || studentsList.size()==0)
                        System.out.println("Danh sach giao vien va sinh vien khong duoc bo trong");
                    else {
                        scanner.nextLine() ;
                        System.out.println("Nhap ma lop hoc can tim(D**CQCN**):");
                        String classID=scanner.nextLine() ;
                        for(int i=0 ; i<teachersList.size() ; i++){
                            if(teachersList.get(i).getmClassCode().equals(classID)){
                                System.out.println("Giao Vien: "+teachersList.get(i).getmName());
                            }
                        }
                        System.out.println("Danh sach sinh vien: ");
                        for(int j=0 ; j<studentsList.size() ; j++){
                            if(studentsList.get(j).getmClassCode().equals(classID)){
                                System.out.println(studentsList.get(j).getmName());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhap so luong sinh vien can them: ");
                    int numberOfStudent=scanner.nextInt() ;
                    for(int i=0 ; i<numberOfStudent ; i++){
                        scanner.nextLine() ;
                        System.out.println("Nhap ten: ");
                        String name=scanner.nextLine() ;
                        System.out.println("Nhap nam sinh: ");
                        String yearOfBirth=scanner.nextLine() ;
                        System.out.println("Nhap gioi tinh: ");
                        String gender=scanner.nextLine() ;
                        System.out.println("Nhap ma sinh vien: ");
                        String studentCode=scanner.nextLine() ;
                        System.out.println("Nhap ma lop: ");
                        String classCode=scanner.nextLine() ;
                        ArrayList<Subject> subjectsList = new ArrayList<>() ;
                        System.out.println("Nhap so hoc phan da hoc: ");
                        int numberOfSubject = scanner.nextInt() ;
                        scanner.nextLine() ;
                        for(int j=0 ; j<numberOfSubject ; j++){
                            System.out.println("Nhap ten hoc phan: ");
                            String nameSubject=scanner.nextLine() ;
                            System.out.println("Nhap ma hoc phan: ");
                            String idSubject=scanner.nextLine() ;
                            System.out.println("So tin chi: ");
                            int numberOfPart=scanner.nextInt() ;
                            System.out.println("Diem: ");
                            float score=scanner.nextFloat() ;
                            scanner.nextLine() ;
                            Subject subject=new Subject(idSubject,nameSubject,numberOfPart,score) ;
                            subjectsList.add(subject) ;
                        }
                        ListSubject listSubject=new ListSubject(studentCode, numberOfSubject, subjectsList) ;
                        listSubjectArrayList.add(listSubject) ;
                        Student student=new Student(name,yearOfBirth,gender,studentCode,classCode) ;
                        studentsList.add(student) ;
                        System.out.println("----");
                    }
                    break;
                case 5:
                    System.out.println("Nhap so luong giao vien can them: ");
                    int numberOfTeacher=scanner.nextInt() ;
                    for(int i=0 ; i<numberOfTeacher ; i++){
                        scanner.nextLine() ;
                        System.out.println("Nhap ten: ");
                        String name=scanner.nextLine() ;
                        System.out.println("Nhap nam sinh: ");
                        String yearOfBirth=scanner.nextLine() ;
                        System.out.println("Nhap gioi tinh: ");
                        String gender=scanner.nextLine() ;
                        System.out.println("Nhap ma giao vien: ");
                        String studentCode=scanner.nextLine() ;
                        System.out.println("Nhap ma lop: ");
                        String classCode=scanner.nextLine() ;
                        Teacher teacher=new Teacher(name,yearOfBirth,gender,studentCode,classCode) ;
                        teachersList.add(teacher) ;
                        System.out.println("----");
                    }
                    break;
                case 6:
                    scanner.nextLine() ;
                    System.out.println("Nhap ma sinh vien hoac giao vien can sua: ");
                    String pesonalCode=scanner.nextLine() ;
                    int tmp=0 ;
                    for(int i=0 ; i<teachersList.size() ; i++){
                        if(pesonalCode.equals(teachersList.get(i).getmPersonalCode())){
                            System.out.println("Ten moi: ");
                            teachersList.get(i).setmName(scanner.nextLine());
                            System.out.println("Nam sinh: ");
                            teachersList.get(i).setmYearOfBirth(scanner.nextLine());
                            System.out.println("Gioi tinh: ");
                            teachersList.get(i).setmGender(scanner.nextLine());
                            System.out.println("Ma giao vien: ");
                            teachersList.get(i).setmPersonalCode(scanner.nextLine());
                            System.out.println("Ma lop: ");
                            teachersList.get(i).setmClassCode(scanner.nextLine());
                            tmp=1 ;
                            break;
                        }
                    }
                    if(tmp==0){
                        for(int j=0 ; j<studentsList.size() ; j++){
                            if(pesonalCode.equals(studentsList.get(j).getmPersonalCode())){
                                System.out.println("Ten moi: ");
                                studentsList.get(j).setmName(scanner.nextLine());
                                System.out.println("Nam sinh: ");
                                studentsList.get(j).setmYearOfBirth(scanner.nextLine());
                                System.out.println("Gioi tinh: ");
                                studentsList.get(j).setmGender(scanner.nextLine());
                                System.out.println("Ma sinh vien: ");
                                studentsList.get(j).setmPersonalCode(scanner.nextLine());
                                System.out.println("Ma lop: ");
                                studentsList.get(j).setmClassCode(scanner.nextLine());
                                tmp=1 ;
                                break;
                            }
                        }
                    }
                    if(tmp==0)
                        System.out.println("Khong tim thay sinh vien hoac giao vien nay");
                    break;
                case 7:
                    scanner.nextLine() ;
                    System.out.println("Nhap ma cua sinh vien can xoa: ");
                    String personalCode=scanner.nextLine() ;
                    for (int i=0 ; i<studentsList.size() ; i++){
                        if(personalCode.equals(studentsList.get(i).getmPersonalCode()))
                            studentsList.remove(i) ;
                    }
                    break;
                case 8:
                    scanner.nextLine() ;
                    System.out.println("Nhap ma sinh vien can sua diem: ");
                    String idStudent=scanner.nextLine() ;
                    int tmpCase8=0 ;
                    for(int i=0 ;i<studentsList.size() ; i++ ){
                        if(studentsList.get(i).getmPersonalCode().equals(idStudent)){
                            System.out.println("Nhap ma hoc phan can sua(khong sua nua thi nhap 0): ");
                            String idSub=scanner.nextLine() ;
                            if(idSub.equals("0"))
                                break;
                            for(int j=0 ; j<listSubjectArrayList.get(i).getmNumberOfSubject() ; j++){
                                if(idSub.equals(listSubjectArrayList.get(i).subjectArrayList
                                        .get(j).getmIdSubject())){
                                    System.out.println("Nhap diem moi: ");
                                    listSubjectArrayList.get(i).subjectArrayList
                                            .get(j).setmScores(scanner.nextFloat());
                                    tmpCase8=1 ;
                                    break;
                                }
                            }
                        }
                        if(tmpCase8==0)
                            System.out.println("Khong tim thay sinh vien nay");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
