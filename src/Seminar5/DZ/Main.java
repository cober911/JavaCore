package Seminar5.DZ;

    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            File currentDir = new File(".");
            File backupDir = new File(currentDir, "backup");
            backups(currentDir, backupDir);
        }

        private static void backups(File directory, File backupPath) throws IOException {
            if (!backupPath.exists()) {
                boolean created = backupPath.mkdirs();
                if (!created) {
                    System.err.println("Failed to create backup directory");
                    return;
                }
            }

            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        try (FileInputStream fis = new FileInputStream(file);
                             FileOutputStream fos = new FileOutputStream(new File(backupPath, file.getName()))) {
                            byte[] buffer = new byte[4096];
                            int bytesRead;
                            while ((bytesRead = fis.read(buffer)) != -1) {
                                fos.write(buffer, 0, bytesRead);
                            }
                        }
                    }
                }
            }
        }
    }

