package arrlist;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_05 {
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("myid", "tha123");
		map.put("ppps", "t34zza");
		map.put("html", "345aas");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String id = "";
			String pw = "";
			try {
				System.out.println("id, password 입력");
				System.out.print("id : ");
				id = sc.nextLine().trim();
				
				System.out.print("password : ");
				pw = sc.nextLine().trim();
				System.out.println();
				
				if(!map.containsKey(id)) {
					System.out.println("입력하신 아이디는 없습니다.");
					continue;
				}
				
				if(!(map.get(id)).equals(pw)) {
					System.out.println("입력하신 비밀번호가 맞질 않습니다.");
				} else {
					System.out.println("id, pw 일치.");
					break;
				}
				
			} catch (Exception e) {
				System.out.printf("입력 오류 : %s", e);
			}
		}
	}
}
