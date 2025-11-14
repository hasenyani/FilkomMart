import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tugas3 {

	static final String KPS_NAMA = "Dr. Budi Santoso, M.Kom."; 
	static final int SKS_MAX = 24;

	static class Course {
		String code;
		String name;
		int sks;

		Course(String code, String name, int sks) {
			this.code = code;
			this.name = name;
			this.sks = sks;
		}
	}

	static class Student {
		String nim;
		String name;
		List<Course> courses = new ArrayList<>();

		Student(String nim, String name) {
			this.nim = nim;
			this.name = name;
		}

		int totalSKS() {
			int sum = 0;
			for (Course c : courses) sum += c.sks;
			return sum;
		}

		boolean addCourse(Course c) {
			if (totalSKS() + c.sks > SKS_MAX) return false;
			courses.add(c);
			return true;
		}
	}

	static void printKRS(Student s) {
		String title = "KARTU RENCANA STUDI (KRS)";
		System.out.println("===============================================================");
		System.out.printf("%s\n", title);
		System.out.println("===============================================================");

		String left = String.format("NIM : %s    Nama : %s", s.nim, s.name);
		String right = String.format("Kepala KPS: %s", KPS_NAMA);
		int width = 70;
		int leftLen = left.length();
		int rightLen = right.length();
		int spaces = Math.max(2, width - leftLen - rightLen);
		System.out.println(left + "".repeat(spaces) + right);

		System.out.println("---------------------------------------------------------------");
		System.out.printf("%3s | %-8s | %-35s | %3s\n", "No", "Kode", "Nama Mata Kuliah", "SKS");
		System.out.println("---------------------------------------------------------------");

		int no = 1;
		for (Course c : s.courses) {
			System.out.printf("%3d | %-8s | %-35s | %3d\n", no, c.code, c.name, c.sks);
			no++;
		}
		System.out.println("---------------------------------------------------------------");
		System.out.printf("Total SKS: %d\n", s.totalSKS());
		System.out.println();

		System.out.println();
		System.out.println("\nMengetahui,\nKepala KPS\n");
		System.out.println();
		System.out.println("( " + KPS_NAMA + " )");
		System.out.println();
		System.out.println("Mahasiswa : " + s.name + " (" + s.nim + ")");
		System.out.println("===============================================================");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Aplikasi Pengisian KRS (OOP) ===");
		System.out.print("Masukkan NIM: ");
		String nim = sc.nextLine().trim();
		System.out.print("Masukkan Nama : ");
		String name = sc.nextLine().trim();

		Student student = new Student(nim, name);

		while (true) {
			System.out.println();
			System.out.println("Total SKS saat ini: " + student.totalSKS() + " / " + SKS_MAX);
			System.out.print("Tambah mata kuliah? (y/n): ");
			String ans = sc.nextLine().trim().toLowerCase();
			if (!ans.equals("y")) break;

			System.out.print("Kode MK: ");
			String kode = sc.nextLine().trim();
			System.out.print("Nama Mata Kuliah: ");
			String mkNama = sc.nextLine().trim();
			System.out.print("SKS: ");
			int sks;
			try {
				sks = Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Input SKS tidak valid. Coba lagi.");
				continue;
			}

			if (sks <= 0) {
				System.out.println("SKS harus > 0. Coba lagi.");
				continue;
			}

			if (student.totalSKS() + sks > SKS_MAX) {
				System.out.println("Gagal menambahkan. Melebihi batas maksimum " + SKS_MAX + " SKS.");
				continue;
			}

			student.addCourse(new Course(kode, mkNama, sks));
			System.out.println("Mata kuliah ditambahkan.");
		}

		System.out.println();
		System.out.println("Cetak KRS? (y/n): ");
		String cetak = sc.nextLine().trim().toLowerCase();
		if (cetak.equals("y")) {
			printKRS(student);
		} else {
			System.out.println("Proses selesai. Terima kasih.");
		}

		sc.close();
	}
}
