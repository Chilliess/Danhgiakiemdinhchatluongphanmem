# Grade Analyzer

Chương trình Java minh họa kiểm thử hộp trắng với một vòng lặp và một lệnh rẽ nhánh. Chương trình nhận danh sách điểm, đếm số điểm đạt và số điểm trượt.

## Cấu trúc chương trình

Phương thức `GradeAnalyzer.analyze` có:

- Vòng lặp `for` để duyệt toàn bộ danh sách điểm.
- Nhánh `if/else` để phân loại điểm từ 50 trở lên là đạt.
- Kết quả trả về theo định dạng `Passed: x, Failed: y`.

## Cấu trúc thư mục dự án

```text
Danhgiakiemdinhchatluongphanmem/
├── README.md
├── .gitignore
├── pom.xml
└── src/
	├── main/
	│   └── java/
	│       └── com/
	│           └── chilliess/
	│               └── GradeAnalyzer.java
	└── test/
		└── java/
			└── com/
				└── chilliess/
					├── GradeAnalyzerStatementTest.java
					└── GradeAnalyzerPathTest.java
```

Trong đó:

- `src/main/java`: chứa mã nguồn chính của chương trình.
- `src/test/java`: chứa các ca kiểm thử JUnit.
- `GradeAnalyzerStatementTest.java`: kiểm thử bao phủ câu lệnh.
- `GradeAnalyzerPathTest.java`: kiểm thử bao phủ đường đi.
- `pom.xml`: cấu hình Maven và dependency JUnit.
- `.gitignore`: loại trừ các file biên dịch trong thư mục `target/`.
- `target/`: thư mục Maven tự sinh sau khi biên dịch hoặc chạy test, không đưa lên Git.

## Yêu cầu môi trường

- Java 17 trở lên
- Apache Maven 3.8 trở lên

## Chạy chương trình

Biên dịch và chạy toàn bộ kiểm thử:

```bash
mvn clean test
```

Chạy chương trình mẫu:

```bash
java -cp target/classes com.chilliess.GradeAnalyzer
```

Kết quả mẫu:

```text
Passed: 2, Failed: 2
```

## Kiểm thử bao phủ câu lệnh

Các ca kiểm thử nằm trong `GradeAnalyzerStatementTest` và bao phủ:

- Vòng lặp không thực hiện với mảng rỗng.
- Nhánh điểm đạt.
- Nhánh điểm trượt.
- Câu lệnh trả về kết quả.

Chạy riêng nhóm test:

```bash
mvn -q -Dtest=GradeAnalyzerStatementTest test
```

Issue: [#1 - Viết ca kiểm thử JUnit bao phủ tất cả các lệnh](https://github.com/Chilliess/Danhgiakiemdinhchatluongphanmem/issues/1)

Commit xử lý: `337ae56 Add statement coverage tests`

## Kiểm thử bao phủ đường đi

Các ca kiểm thử nằm trong `GradeAnalyzerPathTest` và bao phủ các đường đi cơ sở:

- Vòng lặp không chạy lần nào.
- Nhiều lần liên tiếp qua nhánh đạt.
- Nhiều lần liên tiếp qua nhánh trượt.
- Chuyển từ nhánh đạt sang nhánh trượt.
- Chuyển từ nhánh trượt sang nhánh đạt.

Chạy riêng nhóm test:

```bash
mvn -q -Dtest=GradeAnalyzerPathTest test
```

Issue: [#2 - Viết ca kiểm thử JUnit bao phủ tất cả các đường đi](https://github.com/Chilliess/Danhgiakiemdinhchatluongphanmem/issues/2)

Commit xử lý: `6b3609b Add path coverage tests`

Vì chương trình có vòng lặp, số đường đi lý thuyết là vô hạn. Bộ test bao phủ các đường đi cơ sở và các đường đi đại diện có ý nghĩa.

## Kết quả kiểm thử

```text
Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## Lịch sử commit chính

| Commit | Nội dung |
| --- | --- |
| `4187824` | Thêm chương trình Grade Analyzer |
| `337ae56` | Thêm test bao phủ câu lệnh |
| `6b3609b` | Thêm test bao phủ đường đi |

