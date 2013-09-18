set -x

cd $(dirname "$0")
DEPLOYDIR=$(pwd)
echo $DEPLOYDIR

rm backend.war

TMPWARDIR=/tmp/wardir

rm -r $TMPWARDIR

rsync -av --exclude gwt-servlet.jar --exclude .gitignore --exclude WEB-INF/deploy ../WebContent/ $TMPWARDIR/
rsync -av $DEPLOYDIR/../../DMXmlJson/bin/ $TMPWARDIR/WEB-INF/classes/

cd $TMPWARDIR

zip --no-dir-entries $DEPLOYDIR/backend.war $(find -type f)
