package cn.testStringbuilder;
/**
 * ���Կɱ��ַ�����  StringBuilder���̲߳���ȫ��Ч�ʸ� ��, StringBuffer���̰߳�ȫ��Ч�ʵͣ�
 * string�����ɱ��ַ����� 
 * @author uu
 *
 */
public class Test01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //�ַ������ȳ�ʼλ16
		StringBuilder sb1 = new StringBuilder(32); //�ַ������ȳ�ʼλ32
		StringBuilder sb2= new StringBuilder("a"); //�ַ������ȳ�ʼλ17��value[] = {'a',\u0000,\u0000..}
        sb2.append("bc");
        System.out.println(sb2);
        sb2.append("bc").append(true).append("efg");
        System.out.println(sb2);
        
        String str = new String("abc");
        for(int i = 0;i < 3;i++)
        {
        	str += i;
        }
        System.out.println(str);
        /**
         * strָ��new����
         * ������5������newһ��   ��abc�� ��abc0�� "abc01" "abc012"
         * str��ͣ��ָ���µĶ���  �˷ѿռ�
         */
        
        StringBuilder str1 = new StringBuilder("abc");
        for(int i = 0; i < 3; i++){
        	str1.append(i);
        }
        System.out.println(str1);
        /**
         *append������ֱ�Ӹ��������
         *�����ȴ��ڳ�ʼ����ʱ ����������� ���½����飩
         */
        
	}

}
