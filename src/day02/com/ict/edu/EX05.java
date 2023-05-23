package day02.com.ict.edu;
class Ex05{
   public static void main(String[] args){
     int kor = 90 ;
     int eng = 80 ;
     int math = 80 ;
    
    //���� 
   // int sum = 90 + 80 + 80 ; ���� ������� ������ ������ �����. ������ ������ ���� ����
    int sum = kor + eng + math ;
    System.out.println(sum) ;

  // ��� �Ҽ��� 1�ڸ��� ���� ǥ���ϱ�
  // ex)1 int agv1 = sum / 3 ; ���Ұ�� �Ҽ��� �ȳ���(�����̱� ����) 
  // ex)2 double avg2 = sum / 3 ; �Ҽ����� ������(�Ǽ� �̱� ������) �Ҽ��� ���� ������ �ȳ��� 
  // ex)3 double avg3 = (double)(sum / 3) ; �Ҽ����� ������(�Ǽ� �̱� ������) �Ҽ��� ���� ������ �ȳ���
  // ex)4  double avg4 = (double)(sum) / 3 ; ������ ����� sum�� double�� �������
  //double avg5 = sum / 3.0 ; �� ���ϰ� ���� ��� ������ 3�� double �� �������
  double avg5 = sum / 3.0 ;
  
  //avg ������ �Ҽ��� 2�ڸ����� ���ϱ�
  double avg6 = (int)(avg5 *100) / 100.0 ;
  System.out.println(avg6) ;

  // 1472 �� ������ ���� �ؼ� 1470���� �����
  int num1 = 1472 ;
  int num2 = (num1 / 10)*10 ;
  System.out.println(num2);
   }
}