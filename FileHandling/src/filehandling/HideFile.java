/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author suraj
 */
public class HideFile
{
    public static void main(String[] args) throws IOException
    {
        Path p=Paths.get("D:\\Test\\aaa.txt");
        //Files.setAttribute(p, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
        
        Files.setAttribute(p, "dos:hidden", false, LinkOption.NOFOLLOW_LINKS);
    }
}

