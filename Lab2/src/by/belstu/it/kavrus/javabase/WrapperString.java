package by.belstu.it.kavrus.javabase;

import java.util.Objects;

// Задание H
/**  Пользовательская строка*/
public class WrapperString {
    /** @value Содержимое строки*/
    private String line;

    public WrapperString(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(line, that.line);
    }
    @Override
    public int hashCode() {
        return Objects.hash(line);
    }
    @Override
    public String toString() {
        return "WrapperString{" +
                "line='" + line + '\'' +
                '}';
    }

    /** Замена символа
    * @param oldChar заменяемый символ
    * @param newChar символ-заменитель */
    public void replace (char oldChar, char newChar)
    {
        line = line.replace(oldChar, newChar);
    }
    /** Удаление символа из строки
    * @param newChar символ для удаления */
    public void delete (char newChar)
    {
        line = line.replace(newChar, '\u0000');
    }
}
