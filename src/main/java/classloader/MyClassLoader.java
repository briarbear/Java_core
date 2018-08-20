package classloader;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * 自定义的类加载器
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-20 14:21
 */
public class MyClassLoader extends ClassLoader {

    public MyClassLoader(ClassLoader parent) {
        super(parent);
    }

    public MyClassLoader() {
        super(null);  //这句很关键，避免使用父类的加载器
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        File file = new File("E:\\GitHub\\Java_core\\src\\main\\java\\classloader\\People.class");
        try {
            byte[] bytes = getclassBytes(file);  //获取文件的二进制流
            //defineClass方法可以把二进制字节组成的文件转化为java.lang.Class对象
            Class<?> c = this.defineClass(name, bytes, 0, bytes.length);
            return c;
        } catch (ClassFormatError classFormatError) {
            classFormatError.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return super.findClass(name);
    }

    private byte[] getclassBytes(File file) throws IOException {
        // 这里要读取.class字节，使用字节流
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(bos);
        ByteBuffer by = ByteBuffer.allocate(1024);

        while (true){
            int i = fc.read(by);
            if (i == 0 || i == -1) break;
            by.flip();
            wbc.write(by);
            by.clear();
        }
        fis.close();
        return bos.toByteArray();
    }
}
