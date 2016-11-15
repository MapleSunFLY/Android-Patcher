package cn.jesse.patcher.loader;

/**
 * Created by jesse on 15/11/2016.
 */
public class Constants {
    public static final String LOADER_TAG = "Patcher.";

    public static final int BUFFER_SIZE         = 16384;
    public static final int MD5_LENGTH          = 32;
    public static final int MD5_FILE_BUF_LENGTH = 1024 * 100;

    public static final int MAX_EXTRACT_ATTEMPTS = 2;

    public static final String PATCHER_ID     = "PATCHER_ID";
    public static final String NEW_PATCHER_ID = "NEW_PATCHER_ID";

    public static final String OLD_VERSION     = "old";
    public static final String NEW_VERSION     = "new";
    public static final String PATCH_BASE_NAME = "patch-";
    public static final String PATCH_SUFFIX    = ".apk";

    public static final String PACKAGE_META_FILE = "assets/package_meta.txt";

    public static final String SO_META_FILE = "assets/so_meta.txt";
    public static final String SO_PATH      = "lib";

    // If you changed this value, please change the same value in TypedValue, too.
    public static final String DEX_SMALLPATCH_INFO_FILE = "smallpatch_info.ddextra";

    public static final String DEX_META_FILE            = "assets/dex_meta.txt";
    public static final String DEX_PATH                 = "dex";
    public static final String DEX_OPTIMIZE_PATH        = "odex";
    public static final String DEX_SUFFIX               = ".dex";
    public static final String JAR_SUFFIX               = ".jar";

    public static final String CHECK_DEX_INSTALL_FAIL = "checkDexInstall failed";
    public static final String CHECK_RES_INSTALL_FAIL = "checkResInstall failed";

    public static final String RES_META_FILE       = "assets/res_meta.txt";
    public static final String RES_ARSC            = "resources.arsc";
    public static final String RES_MANIFEST        = "AndroidManifest.xml";
    public static final String RES_TITLE           = "resources_out.zip";
    public static final String RES_PATH            = "res";
    public static final String RES_NAME            = "resources.apk";
    public static final String RES_ADD_TITLE       = "add:";
    public static final String RES_MOD_TITLE       = "modify:";
    public static final String RES_LARGE_MOD_TITLE = "large modify:";
    public static final String RES_DEL_TITLE       = "delete:";
    public static final String RES_PATTERN_TITLE   = "pattern:";

    public static final String DEXMODE_RAW = "raw";
    public static final String DEXMODE_JAR = "jar";
    public static final String DEX_IN_JAR  = "classes.dex";

    public static final String PATCH_DIRECTORY_NAME = "PATCHER";
    public static final String PATCH_INFO_NAME      = "patch.info";
    public static final String PATCH_INFO_LOCK_NAME = "info.lock";

    public static final String META_SUFFIX = "meta.txt";

    /**
     * multi process share
     */
    public static final String PATCHER_SHARE_PREFERENCE_CONFIG = "PATCHER_share_config";
    public static final String PATCHER_ENABLE_CONFIG           = "PATCHER_enable";

    /**
     * only for each process
     */
    public static final String PATCHER_OWN_PREFERENCE_CONFIG = "PATCHER_own_config_";
    public static final String PATCHER_SAFE_MODE_COUNT       = "safe_mode_count";
    public static final int    PATCHER_SAFE_MODE_MAX_COUNT   = 3;


    /**
     * notification id, use to Increasing the patch process priority
     * your app shouldn't use the same notification id.
     * if you want to define it, use {@code PATCHERPatchService.setPATCHERNotificationId}
     */
    public static final int PATCHER_PATCH_SERVICE_NOTIFICATION = -1119860829;

    //resource type
    public static final int TYPE_PATCH_FILE  = 1;
    public static final int TYPE_PATCH_INFO  = 2;
    public static final int TYPE_DEX         = 3;
    /**
     * for art small dex
     */
    public static final int TYPE_DEX_FOR_ART = 4;
    public static final int TYPE_DEX_OPT     = 5;
    public static final int TYPE_LIBRARY     = 6;
    public static final int TYPE_RESOURCE    = 7;


    public static final int PATCHER_DISABLE             = 0x00;
    public static final int PATCHER_DEX_MASK            = 0x01;
    public static final int PATCHER_NATIVE_LIBRARY_MASK = 0x02;
    public static final int PATCHER_RESOURCE_MASK       = 0x04;
    public static final int PATCHER_DEX_AND_LIBRARY     = PATCHER_DEX_MASK | PATCHER_NATIVE_LIBRARY_MASK;
    public static final int PATCHER_ENABLE_ALL          = PATCHER_DEX_MASK | PATCHER_NATIVE_LIBRARY_MASK | PATCHER_RESOURCE_MASK;

    //load error code
    public static final int ERROR_LOAD_OK                                         = 0;
    public static final int ERROR_LOAD_DISABLE                                    = -1;
    public static final int ERROR_LOAD_PATCH_DIRECTORY_NOT_EXIST                  = -2;
    public static final int ERROR_LOAD_PATCH_INFO_NOT_EXIST                       = -3;
    public static final int ERROR_LOAD_PATCH_INFO_CORRUPTED                       = -4;
    public static final int ERROR_LOAD_PATCH_INFO_BLANK                           = -5;
    public static final int ERROR_LOAD_PATCH_VERSION_DIRECTORY_NOT_EXIST          = -6;
    public static final int ERROR_LOAD_PATCH_VERSION_FILE_NOT_EXIST               = -7;
    public static final int ERROR_LOAD_PATCH_PACKAGE_CHECK_FAIL                   = -9;
    public static final int ERROR_LOAD_PATCH_VERSION_DEX_DIRECTORY_NOT_EXIST      = -10;
    public static final int ERROR_LOAD_PATCH_VERSION_DEX_FILE_NOT_EXIST           = -11;
    public static final int ERROR_LOAD_PATCH_VERSION_DEX_OPT_FILE_NOT_EXIST       = -12;
    public static final int ERROR_LOAD_PATCH_VERSION_DEX_CLASSLOADER_NULL         = -13;
    public static final int ERROR_LOAD_PATCH_VERSION_DEX_MD5_MISMATCH             = -14;
    public static final int ERROR_LOAD_PATCH_VERSION_DEX_LOAD_EXCEPTION           = -15;
    public static final int ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST      = -16;
    public static final int ERROR_LOAD_PATCH_VERSION_LIB_FILE_NOT_EXIST           = -17;
    public static final int ERROR_LOAD_PATCH_REWRITE_PATCH_INFO_FAIL              = -18;
    public static final int ERROR_LOAD_PATCH_UNKNOWN_EXCEPTION                    = -19;
    //resource
    public static final int ERROR_LOAD_PATCH_VERSION_RESOURCE_DIRECTORY_NOT_EXIST = -20;
    public static final int ERROR_LOAD_PATCH_VERSION_RESOURCE_FILE_NOT_EXIST      = -21;
    public static final int ERROR_LOAD_PATCH_VERSION_RESOURCE_LOAD_EXCEPTION      = -22;
    public static final int ERROR_LOAD_PATCH_VERSION_RESOURCE_MD5_MISMATCH        = -23;
    public static final int ERROR_LOAD_PATCH_UNCAUGHT_EXCEPTION                   = -24;

    public static final int ERROR_LOAD_GET_INTENT_FAIL = -10000;

    //load exception code
    //recover error code
    public static final int ERROR_LOAD_EXCEPTION_UNKNOWN  = -1;
    public static final int ERROR_LOAD_EXCEPTION_DEX      = -2;
    public static final int ERROR_LOAD_EXCEPTION_RESOURCE = -3;
    public static final int ERROR_LOAD_EXCEPTION_UNCAUGHT = -4;


    //recover error code
    public static final int ERROR_PATCH_OK        = 0;
    public static final int ERROR_PATCH_DISABLE   = -1;
    public static final int ERROR_PATCH_NOTEXIST  = -2;
    public static final int ERROR_PATCH_RUNNING   = -3;
    public static final int ERROR_PATCH_INSERVICE = -4;

    //package check error code
    public static final int ERROR_PACKAGE_CHECK_OK                        = 0;
    public static final int ERROR_PACKAGE_CHECK_SIGNATURE_FAIL            = -1;
    public static final int ERROR_PACKAGE_CHECK_PACKAGE_META_NOT_FOUND    = -2;
    public static final int ERROR_PACKAGE_CHECK_DEX_META_CORRUPTED        = -3;
    public static final int ERROR_PACKAGE_CHECK_LIB_META_CORRUPTED        = -4;
    public static final int ERROR_PACKAGE_CHECK_APK_PATCHER_ID_NOT_FOUND   = -5;
    public static final int ERROR_PACKAGE_CHECK_PATCH_PATCHER_ID_NOT_FOUND = -6;
    public static final int ERROR_PACKAGE_CHECK_PATCHER_ID_NOT_EQUAL       = -7;
    public static final int ERROR_PACKAGE_CHECK_RESOURCE_META_CORRUPTED   = -8;
    public static final int ERROR_PACKAGE_CHECK_PATCHERFLAG_NOT_SUPPORT    = -9;
}
