package cn.nukkit.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Deflater;
import java.util.zip.InflaterInputStream;

/**
 *
 * @author ScraMTeam
 */
interface ZlibProvider {
    public byte[] deflate(byte[] data, int level) throws Exception;
    public byte[] inflate(InputStream stream) throws IOException;
}
