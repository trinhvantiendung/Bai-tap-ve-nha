package Triagle_main;

public class Triagle {
	private int a;
	private int b;
	private int c;

	// Ham khoi tao
	public Triagle(int a, int b, int c) throws Exception {
		if (a == 0 && b == 0 && c == 0)
			throw new Exception("Du lieu khong hop le");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Ham kiem tra 3 canh nhap vao co phai 3 canh cua 1 tam khac khong? Neu co thi la tam giac gi?
	// return -1 : Khong phai tam giac
	// return 0 : Tam giac thuong
	// return 1 : Tam giac can
	// return 2 : Tam giac deu
	public int CheckTriagle() {
		boolean check = false;
		if(a < b + c && b < c + a && c < a + b)
			check = true;
		if(check == true){
			if(a != b && b != c && c != a)
				return 0;
			else if(a == b && b == c)
				return 2;
			else 
				return 1;
		}
		return -1;
	}

}
