import React, { useEffect } from "react";
import { Button, View, Alert, PermissionsAndroid, Platform } from "react-native";
import PushNotification from "react-native-push-notification";

const App = () => {

  useEffect(() => {
    // طلب إذن الفيديوهات (Android فقط)
    if (Platform.OS === "android") {
      PermissionsAndroid.request(
        PermissionsAndroid.PERMISSIONS.READ_EXTERNAL_STORAGE,
        {
          title: "إذن الوصول للوسائط",
          message: "التطبيق يحتاج إذن للوصول إلى الفيديوهات",
          buttonNeutral: "اسألني لاحقًا",
          buttonNegative: "إلغاء",
          buttonPositive: "موافق",
        }
      );
    }

    // طلب إذن الإشعارات
    PushNotification.requestPermissions();
  }, []);

  const showNotification = () => {
    PushNotification.localNotification({
      title: "إشعار تجريبي 🚀",
      message: "لقد ضغطت على الزر!",
    });
  };

  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center" }}>
      <Button title="أرسل إشعار" onPress={showNotification} />
    </View>
  );
};

export default App;
